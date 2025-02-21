# FareShare Web Application

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT) ## Overview

FareShare is a web application designed to simplify expense tracking and splitting for group travel. It helps friends keep track of shared costs, calculate individual contributions, and settle up effortlessly. Say goodbye to messy spreadsheets and awkward IOUs!

## Features

- **User Authentication:** Secure signup and login.
- **Trip Management:** Create and manage group trips.
- **Expense Tracking:** Add and categorize expenses (food, travel, accommodation, etc.).
- **Expense Splitting:** Automatically calculate how much each person owes.
- **Payment Integration:** (Planned) Integration with payment gateways for seamless settlements.
- **Notifications:** (Planned) Real-time notifications for expense updates and payments.
- **Chat:** (Planned) Built-in chat functionality for trip members.

## Technologies Used

- **Frontend:** Vaadin Flow
- **Backend:** Spring Boot
- **Database:** PostgreSQL (or MongoDB)
- **Authentication:** OAuth 2.0, JWT
- **Other:** (List other libraries and tools as you use them)

## Getting Started

1. **Clone the repository:**

   ````bash
   git clone [https://github.com/YOUR_USERNAME/FareShare-WebApp.git](https://www.google.com/search?q=https://github.com/YOUR_USERNAME/FareShare-WebApp.git)  ```

   ````

2. **Backend Setup:**

   - Navigate to the `backend` directory.
   - (Add instructions for building and running the backend - e.g., using Maven or Gradle).

3. **Frontend Setup:**
   - Navigate to the `frontend` directory.
   - (Add instructions for running the frontend - e.g., using npm or yarn).

## Development

(Add information about how to contribute to the project, coding conventions, etc.)

## Deployment

(Add instructions for deploying the application - e.g., to Vercel, Render, etc.)

## Contributing

(Add contribution guidelines if you want others to contribute)

## License

MIT License (See [LICENSE](LICENSE) file for details) ```

**Git Workflow and Commit Messages:**

From now on, please follow these guidelines for your Git workflow:

1. **Small, Focused Changes:** Make small, logical changes in each commit. Avoid large, monolithic commits that are hard to review.

2. **Descriptive Commit Messages:** Write clear and concise commit messages that explain _what_ you changed and _why_. Use the present tense. Here are some examples:

   - `feat: Implement user signup functionality` (for new features)
   - `fix: Correct date formatting issue in expense report` (for bug fixes)
   - `refactor: Improve code structure in UserService` (for code improvements)
   - `docs: Update README with deployment instructions` (for documentation changes)
   - `chore: Add dependencies for payment integration` (for dependency updates)

3. **Commit and Push Frequently:** Commit your changes regularly and push them to the remote repository. This ensures you have backups of your work and makes it easy to share your progress.

**Example Git Commands:**

```bash
git add .  # Add all changes (or specify files)
git commit -m "feat: Implement Expense DTO and initial Expense Controller"  # Your commit message
git push origin main  # Push to the main branch (or your branch)
```
