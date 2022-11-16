- **To start the project click here:**
```bash
mvn allure:report;
mv src/test/resources/history/. target/allure-results;
rm -r target/allure-results/history/.;
mv target/site/allure-maven-plugin/history/. src/test/resources;
mvn allure:report;
mvn test;
```