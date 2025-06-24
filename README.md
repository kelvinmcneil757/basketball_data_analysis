# Basketball Data Analysis Web Application

## Overview
This project is a simple web application that analyzes basketball data and provides analytical scores. It uses Java (Spring Boot) for the backend, Python for data processing, and a small HTML/JavaScript frontend.

## Data Source
The data used in this project is sourced from [Basketball Reference](https://www.basketball-reference.com/). This website offers extensive historical and current basketball statistics.

## Setup
1. **Clone the repository**:
   ```
   git clone https://github.com/yourusername/basketball-data-analysis.git
   ```
2. **Install dependencies**:
   - Java: Ensure you have Java and Maven installed.
   - Python: Ensure Python is installed along with `pandas` and `numpy`.

3. **Run the Application**:
   - Start the backend server using:
     ```
     mvn spring-boot:run
     ```
   - Open `src/main/webapp/index.html` in your browser to view the application.

## Running the UI
The landing page allows you to enter a player name and see a score returned from
the backend service. The page now displays status messages while the request is
running and shows the result inside the page without needing to reload.

## Usage
Enter the required data parameters on the web page, and submit to receive the basketball data analysis score.

## New UI Features
- Simple styling using `styles.css`.
- Status updates while analysis is performed.

## Contributing
Feel free to fork the project and submit pull requests.

## License
This project is licensed under the MIT License - see the LICENSE file for details.
