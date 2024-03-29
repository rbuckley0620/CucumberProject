$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddAccount.feature");
formatter.feature({
  "name": "Codefios add account functionality validation",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Given User is on codefios login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "1 - User should be able to login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters username as \"demo1@codefios.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.userEntersUsernameAs(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027user_name\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.189)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-4BN22KQ\u0027, ip: \u0027192.168.1.88\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.20\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.189, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\rbuck\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54104}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: cb21707c4952955ab66d345c280db08b\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027user_name\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat pages.LoginPage.enterUserName(LoginPage.java:23)\r\n\tat steps.LoginStepDefinition.userEntersUsernameAs(LoginStepDefinition.java:34)\r\n\tat ✽.User enters username as \"demo1@codefios.com\"(file:///C:/Users/rbuck/eclipse-workspacenew/Cucumber/src/test/resources/features/AddAccount.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefinition.methodname2(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefinition.userClicksOnSignInButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be landing on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.DashboardStepDefiniton.user_should_be_landing_on_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks on list accounts link",
  "keyword": "When "
});
formatter.match({
  "location": "steps.DashboardStepDefiniton.clicks_on_list_accounts_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should land on account list page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.AddAccountStepDefiniton.user_should_land_on_account_list_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on add account button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefiniton.user_clicks_on_add_account_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters accont name as \"Richie\u0027s Life Savings\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefiniton.user_enters_accont_name_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters description as \"Money for a rainy day\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefiniton.user_enters_description_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters initial balance as \"1,000,000\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefiniton.user_enters_initial_balance_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters account number as \"062095\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefiniton.user_enters_account_number_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enters contact person as \"Richie\u0027s Accountant\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefiniton.user_enters_contact_person_as(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on save button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.AddAccountStepDefiniton.user_clicks_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});