Smart Energy Demand Analysis API
📌 Project Overview
This project is a Spring Boot REST API that analyzes energy demand data and predicts future demand based on historical usage patterns.
It is designed as a backend service, focusing on clean logic, scalability, and real-world architecture.

The API accepts daily energy consumption values, performs analysis such as trend detection and spike detection, and returns a structured prediction result in JSON format.

🧠 Key Features
Energy demand analysis using core Java logic
Trend detection (Increasing / Decreasing / Stable)
Spike detection based on threshold rules
Rule-based demand prediction
REST API built using Spring Boot
Clean controller–service–model architecture
🛠 Technologies Used
Java
Spring Boot
Maven
REST API
Embedded Tomcat
JSON
Eclipse / Spring Tool Suite
Thunder Client / Postman (for testing)
📂 Project Structure
src/main/java/com/energy/demandapi ├── controller │ └── DemandController.java ├── service │ └── DemandService.java ├── model │ ├── DemandRequest.java │ └── DemandResponse.java └── App.java

🔁 API Workflow
Client sends demand data as JSON
Controller receives the request
Service layer performs analysis
Response is returned as JSON
🔗 API Endpoint
Predict Demand
URL: /predict-demand
Method: POST
Content-Type: application/json
Sample Request
{
  "location": "Outskirts",
  "demand": [50, 40, 30]
}
{
  "maxDemand": 50.0,
  "minDemand": 30.0,
  "averageDemand": 40.0,
  "trend": "Decreasing Demand Trend",
  "spikeDetected": true,
  "predictedNextDemand": 33.0
}
How to Run the Project
Prerequisites

Java 17+ (or Java 21)

Maven

Eclipse / Spring Tool Suite

Steps

Clone the repository

Open the project in Eclipse / STS

Run the application as Spring Boot App

Server starts on:

http://localhost:8081

🧪 How to Test

Use Thunder Client or Postman:

Method: POST

URL: http://localhost:8081/predict-demand

Body: JSON (see sample above)

📈 Future Enhancements

Integration with Machine Learning models

Database storage for historical demand

Advanced prediction algorithms

Dashboard / frontend integration

👩‍💻 Author

Challagunda Nikhitha

📌 Note

This project focuses on backend system design and logic.
Machine Learning integration is planned as a future enhancement after sufficient historical data collection.


---

## ✅ What to do next (VERY IMPORTANT)

1️⃣ In your project folder, create a file named **`README.md`**  
2️⃣ Paste the above content  
3️⃣ Save the file  
4️⃣ Run these commands:

```bash
git add README.md
git commit -m "Add README documentation"
git push
