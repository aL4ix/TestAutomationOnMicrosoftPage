$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Microsoft.feature");
formatter.feature({
  "name": "Web Automation Test on Microsoft",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Open Microsoft page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I opened \"https://www.microsoft.com/en-us/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.BackgroundSteps.iOpenedPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate all main menu items are present",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BackgroundSteps.validateAllMainMenuItemsArePresent()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "Get Windows 10 menu elements",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I go to Windows section",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Windows10MenuSteps.iGoToWindowsSection()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Windows 10 menu",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Windows10MenuSteps.iClickOnWindowsMenu()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Return all elements in the dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Windows10MenuSteps.returnAllElementsInTheDropdown()"
});
formatter.write("How to get Windows 10\nBuy Windows 10 Home\nBuy Windows 10 Pro\nRemote resources \u0026 tips\nWindows 7 end of support\nWindows 10 features\nSync phones to computer\nWindows security\nCompare Windows 10 editions\nSpecifications \u0026 requirements");
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Open Microsoft page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I opened \"https://www.microsoft.com/en-us/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.BackgroundSteps.iOpenedPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate all main menu items are present",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.BackgroundSteps.validateAllMainMenuItemsArePresent()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Visual Studio prices",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search for \"Visual Studio\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.SearchSteps.iSearchForSomething(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Return the price of the 3 first elements listed in Software result list",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SearchSteps.returnThePriceOfTheFirstElementsListedInSoftwareResultList(java.lang.Integer)"
});
formatter.write("Price of product number 0: $1,199.00");
formatter.write("Price of product number 1: $5,999.00");
formatter.write("Price of product number 2: $899.00");
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded8.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Store the price of the first product",
  "keyword": "And "
});
formatter.match({
  "location": "steps.SearchSteps.storeThePriceOfTheFirstProduct()"
});
formatter.write("Storing: $1,199.00");
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter the details page on the first product",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.SearchSteps.iEnterTheDetailsPageOnTheFirstProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded10.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate product price and store it",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SearchSteps.validateProductPriceAndStoreIt()"
});
formatter.write("Storing: $1,199.00");
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded11.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I add the product to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "steps.SearchSteps.iAddTheProductToTheCart()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded12.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Verify all 3 price amounts are the same",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SearchSteps.verifyAll3PriceAmountsAreTheSame()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded13.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I select \"20\" products",
  "keyword": "When "
});
formatter.match({
  "location": "steps.SearchSteps.iSelectNProducts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded14.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate total amount is unit price by \"20\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.SearchSteps.validateTotalAmount(java.lang.String)"
});
formatter.write("23980.00");
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded15.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});