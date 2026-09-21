# Artifact notes

`simplifyhr-resource.xml` is the resource configuration exported through midPoint's raw editor after removing duplicate Email and Status conditions. Operational metadata and cached schema are omitted from the portfolio copy; mappings, correlation, synchronization, connector settings, and configured capabilities are retained.

The connector reference OID belongs to this lab. When adapting the resource to another installation, resolve its own CsvConnector reference and CSV location first. This is an implementation artifact, not a portable one-click installer.

The two `.groovy` files are extracted from the resource's **Expression** elements. They belong in the respective inbound mapping expressions, not in Boolean conditions.

- Email: normalizes first and last names and constructs `firstname.lastname@simplifytech.com`.
- Status: returns `ActivationStatusType.ENABLED` for `Active`, otherwise `DISABLED`.

The scripts follow the [SimplifyIAM lesson](https://www.skool.com/simplify-iam-6792/classroom/dc510113?md=fbceae818fe540599fe12e872d47f089). The CSV contains simulated lab employees. No credentials or CSV employee dataset are included here.

## Directory provisioning artifacts

`openldap-outbound-mappings.xml` is a credential-free schema-handling excerpt extracted from the live OpenLDAP resource on September 21, 2026. It defines the `account` / `default` object type and its seven outbound mappings. It is not a complete resource import: connector configuration, connection credentials, cached schema, operational metadata, correlation, and synchronization sections are excluded. Review and merge the relevant configuration into an existing compatible resource when adapting it.

`dn-routing.groovy` is the exact DN expression extracted from that configuration. Its source is the midPoint user's `name`, which holds the employee ID for HR users. It constructs a DN under `ou=people` unless the user is disabled, in which case it constructs one under `ou=inactive`.

The DN script alone does not establish the final offboarding behavior. The Employee role's auto-assignment condition also stops matching disabled users, which can remove the account requirement. The portfolio evidence verifies onboarding; a combined leaver test remains a separate validation.

| midPoint source | LDAP target |
| --- | --- |
| `givenName` | `givenName` |
| `familyName` | `sn` |
| `givenName` + `familyName` | `cn` |
| `name` plus user status | `dn` |
| `emailAddress` | `mail` |
| `costCenter` | `departmentNumber` |
| `name` | `employeeNumber` |
