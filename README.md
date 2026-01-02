
🚀 Smart Resource Prediction API

(Spring Boot REST API)

📌 Project Overview

The Smart Resource Prediction API is a Spring Boot–based RESTful backend application that processes resource demand data and provides analytical results through JSON-based APIs.

This project focuses on Spring Boot fundamentals, REST API design, and JSON request/response handling, tested using Thunder Client.

🎯 Objective

To build a clean and structured Spring Boot REST API that:

Accepts data in JSON format

Processes input using Java logic

Returns meaningful responses

Can be tested easily using Thunder Client

🛠️ Technologies Used

Java

Spring Boot

Spring Web (REST APIs)

Maven

Thunder Client (VS Code)

🧱 Application Architecture
Client (Thunder Client / Postman)
        ↓
Spring Boot Controller
        ↓
Service Layer (Business Logic)
        ↓
Response (JSON)

📂 Project Structure
Smart-Resource-Prediction-API/
│
├── src/main/java/
│   └── com/energy/resourceapi/
│       ├── controller/        # REST Controllers
│       ├── service/           # Business Logic
│       ├── model/             # Request & Response DTOs
│       └── Application.java   # Main Spring Boot class
│
├── src/main/resources/
│   └── application.properties
│
├── pom.xml
├── README.md
└── .gitignore

🔌 API Endpoint
📥 Analyze Resource Demand

Endpoint

POST /api/analyze

📤 Request Body (JSON)

Use this JSON in Thunder Client:

{
  "pastDemand": [120, 140, 160, 180, 200]
}

📤 Response (JSON)
{
  "averageDemand": 160.0,
  "trend": "Increasing",
  "message": "Resource demand is increasing"
}

🧪 Testing with Thunder Client

Open VS Code

Click Thunder Client

Create a New Request

Method: POST

URL:

http://localhost:8080/api/analyze


Header:

Content-Type: application/json


Paste the JSON request body

Click Send

⚙️ How the API Works

Client sends demand data in JSON format

Spring Boot controller receives the request

Service layer processes the data

API returns analyzed results as JSON

🎓 Learning Outcomes

Understanding Spring Boot project structure

Building REST APIs using Spring Web

Handling JSON requests and responses

Testing APIs using Thunder Client

Writing clean controller and service layers

🚀 Future Enhancements

Add database integration

Add validation and exception handling

Add more analytical endpoints

Add Swagger API documentation

📬 Author

Challagunda Nikhitha
B.Tech – Computer Science & Engineering

⭐ Support

If you find this project useful:

⭐ Star the repository

🍴 Fork the repository
