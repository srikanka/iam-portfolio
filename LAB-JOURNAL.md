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

### Lesson 2: Building roles and auto-assignment — October 9, 2026 (verified October 17)

- Built three business roles: Engineering_Employee (OpenLDAP inducement), HR_Employee (no inducement), and Contractor (requestable, no auto-assign).
- Added strong auto-assign rules on `organizationalUnit`; one recompute assigned department roles that match HR for all eight users.
- Requested Contractor for Emma (`1005`) via self-service. No approval case was created because no approval policy exists yet.
- What broke: the Business role wizard only offers application roles. I added the OpenLDAP account through the role's Inducements → Resource tab. A duplicate role name and a duplicate inducement came from repeating steps, and I removed them.
- Open items: department rule ignores terminated status (`1006`); stray Employee assignment on each role object.
- [Lab write-up and screenshots](rbac-roles/README.md) · [Step-by-step learning note](https://app.notion.com/p/3f371b972dfd816bad92f2a2a6affcad)

### Lesson 3: The mover fires — October 17, 2026

- Changed Emma (`1005`) from Engineering to HR in SimplifyHR (cost center HR-002), then ran the SimplifyHR reconciliation.
- Result: Engineering_Employee removed, HR_Employee added, Employee and Contractor kept, recorded as one audited *Modify object* event (Reconciliation, Success).
- Learned that the swap only works because the auto-assign rules are **strong**. Requested access (Contractor) survives a move by design, which is the leftover access that certification must catch.
- Emma's OpenLDAP account stayed linked through the Employee role. LDAP group changes were not checked.
- [Mover write-up and before/after screenshots](rbac-roles/README.md#the-mover-emma-moves-from-engineering-to-hr) · [Notion lab journal](https://app.notion.com/p/3fc71b972dfd8198bb9de6e5ad3bdebe)

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
