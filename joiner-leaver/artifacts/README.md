# Artifact notes

`simplifyhr-resource.xml` is the resource configuration exported through midPoint's raw editor after removing duplicate Email and Status conditions. Operational metadata and cached schema are omitted from the portfolio copy; mappings, correlation, synchronization, connector settings, and configured capabilities are retained.

The connector reference OID belongs to this lab. When adapting the resource to another installation, resolve its own CsvConnector reference and CSV location first. This is an implementation artifact, not a portable one-click installer.

The two `.groovy` files are extracted from the resource's **Expression** elements. They belong in the respective inbound mapping expressions, not in Boolean conditions.

- Email: normalizes first and last names and constructs `firstname.lastname@simplifytech.com`.
- Status: returns `ActivationStatusType.ENABLED` for `Active`, otherwise `DISABLED`.

The scripts follow the [SimplifyIAM lesson](https://www.skool.com/simplify-iam-6792/classroom/dc510113?md=fbceae818fe540599fe12e872d47f089). The CSV contains simulated lab employees. No credentials or CSV employee dataset are included here.
