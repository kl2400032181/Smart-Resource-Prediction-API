🚀 Smart Resource & Demand Prediction API

(Spring Boot + Java + DSA + Machine Learning)

📌 Project Overview

The Smart Resource & Demand Prediction API is a Spring Boot–based RESTful backend application that analyzes historical resource (energy) demand and predicts future demand using Java logic, DSA-based feature engineering, and a Machine Learning model.

This project demonstrates how backend APIs, core programming fundamentals, and ML models can be integrated to solve real-world demand forecasting problems.

🎯 Problem Statement

Resource demand (such as electricity or energy) varies due to:

Daily usage patterns

Sudden spikes

Long-term trends

Manual estimation is inefficient and inaccurate.
This API automates:

Demand analysis

Feature extraction

Future demand prediction

using Java logic + ML, exposed through REST APIs.

🛠️ Technologies Used
Backend

Java

Spring Boot

Spring Web (REST APIs)

Maven

Core Concepts

DSA (Arrays, loops, conditionals)

OOPS

Feature Engineering

Machine Learning

Python

Regression-based ML model

CSV-based training data

Tools

Git & GitHub

Eclipse / IntelliJ

Postman (API testing)

🧠 Core Concepts Implemented

RESTful API design

Java-based data preprocessing

Feature extraction from historical data

CSV data exchange between Java and ML

Future demand prediction using ML

Clean backend architecture (Controller → Service → Model)

🧱 Application Architecture
Client (Postman / Frontend)
        ↓
Spring Boot REST API
        ↓
Service Layer (Java + DSA Logic)
        ↓
Feature Engineering
        ↓
CSV Dataset
        ↓
Python ML Model
        ↓
Future Demand Prediction

⚙️ API Features

Accepts historical demand data via REST API

Generates features:

Average demand

Day-to-day change

Spike detection

Integrates ML model for prediction

Returns predicted future demand

Modular and scalable backend design

📂 Project Structure
Smart-Resource-Prediction-API/
│
├── src/main/java/
│   └── com/energy/demandapi/
│       ├── controller/        # REST Controllers
│       ├── service/           # Business logic & DSA
│       ├── model/             # Request/Response models
│       └── App.java           # Main Spring Boot app
│
├── src/main/resources/
│   └── application.properties
│
├── ml/                         # Python ML scripts
├── pom.xml                     # Maven dependencies
├── README.md                   # Documentation
├── .gitignore                  # Ignored build files

🔌 API Endpoints
📥 Predict Future Demand

Endpoint

POST /api/predict


Request Body (JSON)

{
  "pastDemand": [120, 130, 150, 170, 180]
}


Response

{
  "averageDemand": 150.0,
  "trend": "Increasing",
  "spikeDetected": false,
  "predictedDemand": 190
}

🧪 How It Works

Client sends historical demand data to API

Spring Boot controller receives request

Service layer applies DSA logic:

Average calculation

Change detection

Spike identification

Features are saved into CSV

ML model processes data

API returns predicted future demand

📈 Use Cases

Smart energy management systems

College or industry resource planning

Demand forecasting applications

Backend + ML integration learning project

🧑‍💻 Learning Outcomes

Strong understanding of Spring Boot REST APIs

Hands-on experience with Java + DSA

Feature engineering for ML

Backend–ML integration

Clean API architecture

Professional GitHub project structure

🚀 Future Enhancements

Real-time data ingestion

Database integration (MySQL/PostgreSQL)

Advanced ML models (LSTM, ARIMA)

Frontend dashboard

Cloud deployment (AWS)

📬 Author

Challagunda Nikhitha
B.Tech – Computer Science & Engineering

⭐ Support

If you like this project:

⭐ Star the repository

🍴 Fork it

📣 Share feedback
