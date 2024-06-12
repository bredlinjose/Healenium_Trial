Healenium

♦ Open the Docker Desktop UI application and the Docker Engine needs to be up and running.

♦ Open Terminal under the infra folder and run the command docker-compose up -d. This will start healenium, postgres-db and selector-imitator images in Docker.

♦ Check if all images are running properly in the command prompt by using the command docker container ps. Also, we can check from the Docker Desktop UI application.

♦ Choose the test  suite or test scripts you want to execute and Click the Run button in your IDE.

♦ First, run the script with the correct web element successfully to find and store all the correct locators at the hlm-backend.

♦ If any changes in the elements at the DOM level, it will be compared with the hlm-backend based on that it will self-heal.

♦ After the execution open localhost:7878 to check the report, screenshot and selectors.
