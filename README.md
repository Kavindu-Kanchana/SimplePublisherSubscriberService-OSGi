# SimplePublisherSubscriberService-OSGi

## Project Overview

`SimplePublisherSubscriberService-OSGi` is an OSGi-based project that implements a simple Publisher-Subscriber model using Eclipse EE. This project demonstrates how different services can communicate within an OSGi framework using a publisher and subscriber setup. The service is designed to manage a Doctor Payment Management System in a Medical Center, calculating doctors' monthly salaries based on their basic salary, overtime rate, and hours worked.

## Features

- **Doctor Payment Management Service**: 
  - Takes inputs such as Doctor’s Name, Mobile Number, Specialization, Basic Salary, Overtime rate per hour, and Number of Overtime hours worked.
  - Calculates the monthly salary for each doctor.
  - Computes the total amount that the Medical Center should pay for all doctors.

## Getting Started

### Prerequisites

- Eclipse IDE for Enterprise Java and Web Developers (Eclipse EE).
- OSGi plugin for Eclipse.
- Java Development Kit (JDK) version 1.8 or higher.

### Installation and Running the Project

1. **Clone or Download the Repository**:
   - Clone the repository:
   - Or download the ZIP file from GitHub and extract it.

2. **Import the Project into Eclipse**:
   - Open Eclipse EE.
   - Go to `File` > `Import...` > `Existing Projects into Workspace`.
   - Select the root directory of the downloaded or cloned project.
   - Click `Finish` to import the project.

3. **Run the Project**:
   - Open the OSGi perspective: `Window` > `Perspective` > `Open Perspective` > `Other...` > `OSGi`.
   - Locate the `DoctorPaymentPublisher` and `DoctorPaymentSubscriber` services in the Project Explorer.
   - Right-click on each service and select `Run As` > `OSGi Framework`.
   - Both services will start, and you can observe their status in the OSGi console.

## Creating a New Configuration File

### For DoctorPaymentPublisher

1. **Create a new OSGi Configuration File**:
   - From the Bundles view in Eclipse, select `DoctorPaymentPublisher` from the Workspace.

### For DoctorPaymentSubscriber

1. **Create a new OSGi Configuration File**:
   - From the Bundles view in Eclipse, select `DoctorPaymentPublisher` and `DoctorPaymentSubscriber` from the Workspace.

## Project Structure

- **doctorpaymentpublisher**: Contains the Publisher service code.
- **doctorpaymentsubscriber**: Contains the Subscriber service code.

## Troubleshooting

- If either service does not start correctly, ensure that all required OSGi bundles are properly activated in the Eclipse environment.
- Check the Eclipse console for any error messages during service startup.

## Contribution

- This Project was created by Kavindu Kanchana 
