# TestAutomationOnMicrosoftPage

### About this project 
This Automation project is using Java, Selenium and Cucumber.

The code is separated in five pieces:
1. Cucumber's feature file is inside the resources folder.
2. Cucumber's test runner is at the default package.
3. Cucumber's steps are inside the steps package.
4. Page Object Model's pages are inside the pages package.
5. There is a small Selenium library to leverage common Selenium operations inside the ui package. 
6. There is configuration json file inside the resources folder, valid values are firefox and chrome

### Reports
After executing the tests a report will be generated in a folder called cucumber-reports inside the target folder.

Currently, there is one report I generated running in Linux with Chrome, as evidence that the code is working. I tested with Firefox and Chrome in Linux. They worked OK.
