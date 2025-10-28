Project : SauceDemo Test Automation

This project contains automated test scripts for the website [SauceDemo](https://www.saucedemo.com), built using Selenium WebDriver and Purpose

The goal is to automate functional test scenarios to validate the behavior of the SauceDemo site, commonly used as a demo environment for QA testing.

🛠️ Technologies Used

•	Java

•	Selenium WebDriver

•	Cucumber (BDD)

•	TestNG

•	Maven

📦 Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/marwantoul/saucedemo.git

Open the project in an IDE like 🧠 IntelliJ IDEA or 🌘 Eclipse.

Install dependencies using Maven : mvn install

🚀 Running Tests

mvn test

📁 Project Structure

<img width="539" height="816" alt="image" src="https://github.com/user-attachments/assets/7c6c10cc-9550-4dd3-8248-6e56e74e5d20" />




🧪 Test Scenarios

✅ Login Feature

•	Valid and invalid login combinations

•	Expected error messages and successful login

✅ Add to Cart Feature

•	Add product to cart

•	Button changes from "Add to Cart" to "Remove"

•	Cart notification badge appears

✅ Checkout Feature

•	View cart details

•	Start checkout process

•	Fill in user information

•	Complete checkout and verify success message

📄 Feature Files

•	Login.feature

•	AddToCart.feature

•	CheckOutCart.feature

📊 Allure Report Integration 

Add Allure Maven Plugin :

 <!-- https://mvnrepository.com/artifact/io.qameta.allure/allure-testng -->
        <dependency>
            <groupId>io.qameta.allure</groupId>
            <artifactId>allure-testng</artifactId>
            <version>2.29.1</version>
        </dependency>

Run your tests : 

mvn test

Generate the Allure report :

Allure serve allure-results 

👩‍💻 Author
Marwa Antoul
QA Analyst | Test Automation Engineer
