# ATMManagementSystem

#Technologies Used
Spring Boot: Backend framework.
MySQL: Database.
Hibernate/JPA: ORM for database interaction.
Jackson: JSON serialization/deserialization.
Postman: API testing.

#Entity Relationships

1. AtmSiteEntity
id: Primary key.
siteCode, address, status, installationDate.
Relationship: Many-to-One with PropertyOwnerEntity.

2. PropertyOwnerEntity
id: Primary key.
name, contactDetails, bankAccountInfo.
Relationship: One-to-Many with AtmSiteEntity.

3. LeaseAgreementEntity
id: Primary key.
startDate, endDate, rentAmount.
Relationship: One-to-One with AtmSiteEntity.

#Features
1. ATM Site Management:
CRUD operations for managing ATM sites.
Each ATM site includes the following details:
siteCode: A unique code for the ATM site.
address: The location of the ATM site.
status: The status of the site (e.g., ACTIVE/INACTIVE).
installationDate: Date of installation.
propertyOwnerEntity: Associated property owner details.

2. Property Owner Management:
Manage property owners, including:
Name, contact details, and bank account information.
List of associated ATM sites.

3. Lease Agreement Management:
Manage lease agreements for ATM sites:
Rent amount.
Agreement start and end dates.
