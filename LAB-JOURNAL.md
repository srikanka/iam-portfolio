# Lab Journal

<!--
Keep a short journal entry for each module while the work is fresh. This is for
YOU, it is where you record what you did, what broke, and what you learned. It
also becomes the raw material for your README use-case sections and your resume.

Answer the journal questions from each module's lesson here. Do not worry about
polish, this is a working document.
-->

## Module 1: Fundamentals and Foundations

- What is the difference between IGA and Access Management?
  [Your answer]
- Why is HR the source of truth and not the IGA platform?
  [Your answer]
- One thing that surprised me:
  [Your answer]

## Module 2: IGA, Joiner and Leaver

- What did disabling the Delete capability protect me from?
  [Your answer]
- Which mappings used Groovy, and what did each do?
  [Your answer]
- After reconciliation, identities existed in midPoint but the directory was empty. Why?
  [Your answer]
- What broke for me, and how I fixed it:
  [Your answer]

### Lesson 7: Service account ownership — September 29, 2026

- Linked `svc-backup` to James (`1002`) by matching LDAP `carLicense` to midPoint `name`.
- Separated human and service accounts using OU scopes and default/NHI intents.
- Verified one linked service account and three James projections: HR plus two LDAP accounts.
- Learned that correlation finds the owner, while synchronization reactions decide whether to link or leave an account unmatched.
- Documented the strong-versus-weak additionalName mapping difference and the unverified optional orphan test.
- [Lab write-up and screenshots](non-human-identities/README.md) · [Step-by-step learning note](https://app.notion.com/p/3ea71b972dfd816b94edfa5def0aff47)

## Module 3: IGA, Mover and RBAC

- What is the difference between an auto-assigned role and a manually requested role?
  [Your answer]
- Why does mapping strength "strong" matter for the mover?
  [Your answer]
- What is access certification and when is it triggered?
  [Your answer]

## Module 4: CIAM and Federation

- What is the difference between OIDC and OAuth?
  [Your answer]
- Where is SAML still used, and why?
  [Your answer]
- What did I see when I decoded the token or the assertion?
  [Your answer]

## Module 5: Career

- One resume bullet I am proud of:
  [Your answer]
- The use case I can explain most confidently in an interview:
  [Your answer]
