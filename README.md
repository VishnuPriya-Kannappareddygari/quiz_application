
# Quiz Application

A Spring Boot-based RESTful Quiz Application that allows users to take quizzes by category, submit answers, and receive a score. Admins can also add new questions and create quizzes dynamically.

---

##  Features

-  Add new quiz questions by category  
-  Create quizzes with a specific number of questions and category  
-  Fetch all questions or filter by category  
-  Take quizzes and get scored automatically  
-  RESTful API design with clear endpoints  
-  Layered architecture (Controller, Service, DAO)

---

## Tech Stack

- **Java 17**  
- **Spring Boot**  
- **Spring Web**  
- **JPA/Hibernate**  
- **MySQL**  
- **Maven**

---

## Project Structure

```
quizapp/
├── src/
│   ├── main/
│   │   ├── java/com/vishnu/quizapp/
│   │   │   ├── controller/
│   │   │   │   ├── QuestionController.java
│   │   │   │   └── QuizController.java
│   │   │   ├── dao/
│   │   │   │   ├── QuestionDao.java
│   │   │   │   └── QuizDao.java
│   │   │   ├── model/
│   │   │   │   ├── Question.java
│   │   │   │   ├── QuestionWrapper.java
│   │   │   │   ├── Quiz.java
│   │   │   │   └── Response.java
│   │   │   ├── service/
│   │   │   │   ├── QuestionService.java
│   │   │   │   └── QuizService.java
│   │   │   └── QuizappApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
├── pom.xml
└── README.md
```

---

## API Endpoints

### QuestionController

| Method | Endpoint                        | Description                  |
|--------|----------------------------------|------------------------------|
| GET    | `/question/allQuestions`         | Get all available questions |
| GET    | `/question/category/{cat}`       | Get questions by category   |
| POST   | `/question/add`                  | Add a new question          |

### QuizController

| Method | Endpoint                                                   | Description                         |
|--------|-------------------------------------------------------------|-------------------------------------|
| POST   | `/quiz/create?category=java&numQ=5&title=JavaBasics`       | Create a quiz                       |
| GET    | `/quiz/get/{id}`                                            | Fetch quiz questions by quiz ID     |
| POST   | `/quiz/submit/{id}`                                         | Submit quiz answers and get score   |

---

## How to Run

1. **Clone the repo**  
```bash
git clone https://github.com/VishnuPriya-Kannappareddygari/quiz_application.git
cd quizapp
```

2. **Build the project**  
```bash
mvn clean install
```

3. **Run the app**  
```bash
mvn spring-boot:run
```

4. **Access the APIs**  
Visit: [http://localhost:8080](http://localhost:8080)

---

## Example Quiz Flow

- Admin adds questions  
- Admin creates a quiz with category and number of questions  
- User fetches the quiz via `/quiz/get/{id}`  
- User submits responses via `/quiz/submit/{id}`  
- Score is returned based on correct answers  

---

## Sample JSON

### Add Question (`POST /question/add`)
```json
{
  "category": "java",
  "difficultyLevel": "easy",
  "option1": "Spring",
  "option2": "Hibernate",
  "option3": "JSP",
  "option4": "React",
  "questionTitle": "Which of these is a Java framework?",
  "rightAnswer": "Spring"
}
```

### Submit Quiz (`POST /quiz/submit/{id}`)
```json
[
  {
    "id": 1,
    "response": "Spring"
  },
  {
    "id": 2,
    "response": "JPA"
  }
]
```

---

## Future Enhancements

-  Add user authentication with Spring Security    
-  Build a frontend using React or Angular  
-  Add an admin dashboard for analytics  
-  Write unit and integration tests  

---

## Author

**VishnuPriya Kannappareddygari**  
🔗 [GitHub](https://github.com/VishnuPriya-Kannappareddygari)

---

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
