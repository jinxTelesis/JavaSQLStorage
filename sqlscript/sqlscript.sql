CREATE TABLE INVOICE(
INVID char(10) NOT NULL unique,
IDate char(10) NOT NULL,
CompanyName Char(50) NOT NULL,
StreetAddress Char(50) NOT NULL,
City Char(50) NOT NULL,
State Char(50) NOT NULL,
Zip Int NOT NULL,
Phone Char(15) NOT NULL,
BName Char(50) NOT NULL,
BCompanyName Char(50) NOT NULL,
BStreetAddress Char(50) NOT NULL,
BCity Char(50) NOT NULL,
BState Char(50) NOT NULL,
BZip int NOT NULL,
BPhone Char(15) NOT NULL,
BEmailAddress Char(50) NOT NULL,
Item0Desc Char(250) NOT NULL,
Qty0 int NOT NULL,
Unit0 double NOT NULL,
Taxed0 double NOT NULL,
Amount0 double NOT NULL,
Item1Desc Char(250) NOT NULL,
Qty1 int NOT NULL,
Unit1 double NOT NULL,
Taxed1 double NOT NULL,
Amount1 double NOT NULL,
Item2desc Char(250) NULL,
Qty2 int NULL,
Unit2 double NULL,
Taxed2 double NULL,
Amount2 double NULL,
Item3desc Char(250) NULL,
Qty3 int NULL,
Unit3 double NULL,
Taxed3 double NULL,
Amount3 double NULL,
Item4desc Char(250) NULL,
Qty4 int NULL,
Unit4 double NULL,
Taxed4 double NULL,
Amount4 double NULL,
Item5desc Char(250) NULL,
Qty5 int NULL,
Unit5 double NULL,
Taxed5 double NULL,
Amount5 double NULL,
Constraint INVOICE_PK PRIMARY KEY(INVID)
);