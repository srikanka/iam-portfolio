# Artifacts

Save the actual configuration you built here, then link to it from the main README.

This is your strongest technical evidence. Screenshots prove something happened.
Artifacts prove how you built it, and they let a technical interviewer read your
actual work.

## What to save here

- Resource configurations exported from midPoint (resource XML)
- Groovy mapping scripts (inbound email mapping, DN routing script, status mapping)
- Role definitions with their autoassign blocks
- The certification campaign definition, if you exported it
- Any Auth0 config worth showing (a Login Action script, a SAML attribute mapping)

## Suggested file names

- simplifyhr-resource.xml
- inbound-email-mapping.groovy
- openldap-resource.xml
- dn-routing.groovy
- status-mapping.groovy
- employee-role.xml
- engineering-employee-role.xml
- hr-employee-role.xml
- certification-campaign.xml
- auth0-login-action.js

## How to export config from midPoint

Open the object (resource, role, or template), switch to the raw XML or edit-raw
view, and copy the XML into a file here.

## One safety rule, do not skip this

Before you commit anything, check it for passwords, bind credentials, client
secrets, or API keys. Replace them with a placeholder like REDACTED. A public
portfolio must never contain a real secret. midPoint resource XML often contains
the directory bind password, remove it before you commit.
