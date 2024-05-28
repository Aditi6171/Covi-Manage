CREATE TABLE user(
	userName varchar(40)  NOT NULL,
	password varchar(80) NOT NULL,
	firstName VARCHAR(40) NOT NULL,
	lastName VARCHAR(40) NOT NULL,
	gender VARCHAR(20) NOT NULL,
	mobileNumber VARCHAR(20) NOT NULL,
	emailId VARCHAR(80) NOT NULL,
	address VARCHAR(400) NOT NULL,
	userEnabled BOOLEAN NOT NULL DEFAULT true,
	CONSTRAINT USER_PK PRIMARY KEY (userName)
);

INSERT INTO user(userName, password, firstName, lastName, gender, mobileNumber, emailId, address, userEnabled) 
VALUES('aditi',  'aditi',  'Aditi',   'Singh', 'female',  '9004001111', 'myemail@mail.com', 'Thane', true);

CREATE TABLE VaccineBookingSlot(
	id INTEGER NOT NULL AUTO_INCREMENT,
	vaccineType VARCHAR(40) NOT NULL,
	vaccineLocation VARCHAR(40) NOT NULL,	
	vaccineDate DATE NOT NULL,
	timeSlot VARCHAR(40) NOT NULL,
	userName VARCHAR(40)  NOT NULL,
	CONSTRAINT VACCINE_BOOKING_SLOT_PK PRIMARY KEY (id),
	CONSTRAINT VACCINE_BOOKING_SLOT_USERNAME_FK FOREIGN KEY (userName) REFERENCES user (userName)
);

CREATE TABLE OxygenCylinderBooking(
	id INTEGER NOT NULL AUTO_INCREMENT,
	oxygenCylinderType VARCHAR(40) NOT NULL,
	oxygenCylinderQuantity INTEGER NOT NULL,
	bookingDate DATE NOT NULL,
	userName VARCHAR(40) NOT NULL,
	CONSTRAINT VACCINE_BOOKING_SLOT_PK PRIMARY KEY (id),
	CONSTRAINT OXYGENCYLINDERBOOKING_USER_NAME_FK FOREIGN KEY (userName) REFERENCES user (userName)
);