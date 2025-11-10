# MS-Banque — Endpoints reference

This file lists the public REST endpoints provided by the MS-Banque sample service. It intentionally contains only the endpoints (no tooling references or sensitive details).

Base URL (default): `http://localhost:8082/api`

Clients
- GET `/api/clients` — list clients
- GET `/api/clients/{id}` — get a client by id
- POST `/api/clients` — create a client (JSON body with `nom` and `email`)
- PUT `/api/clients/{id}` — update a client (JSON body with `nom` and `email`)
- DELETE `/api/clients/{id}` — delete a client
- GET `/api/clients/{id}?projection=clientDetails` — projection returning name and email

Comptes (Accounts)
- GET `/api/comptes` — list accounts
- GET `/api/comptes/{id}` — get an account by id
- POST `/api/comptes` — create an account (JSON body with `solde`, `dateCreation`, `type`, and `client` reference)
- PUT `/api/comptes/{id}` — update an account (JSON body with fields to update, e.g. `solde` or `type`)
- DELETE `/api/comptes/{id}` — delete an account
- GET `/api/comptes/search/byType?t={TYPE}` — search accounts by `TypeCompte` (e.g. `EPARGNE` or `COURANT`)
- GET `/api/comptes/{id}?projection=solde` — projection returning only the balance
- GET `/api/comptes/{id}?projection=mobile` — projection returning balance and type

Notes
- The service uses Spring Data REST; entity IDs are exposed.
- The H2 in-memory database is used for demo purposes; data is not persisted across restarts.

If you'd like the README to include run instructions again (or a small script to exercise a few endpoints), tell me and I will add a brief, non-sensitive section.
```

  

https://github.com/user-attachments/assets/cc084f37-e38d-4698-888a-0f011d0c8864

