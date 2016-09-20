$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepagecheck.feature");
formatter.feature({
  "line": 1,
  "name": "Check that the latest news header is displayed on the homepage",
  "description": "",
  "id": "check-that-the-latest-news-header-is-displayed-on-the-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Navigate to homepage and check that latest news section is displayed",
  "description": "",
  "id": "check-that-the-latest-news-header-is-displayed-on-the-homepage;navigate-to-homepage-and-check-that-latest-news-section-is-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Navigation to homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I check for the latest news section",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Latest News Section is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "homepagestepdefs.navigationToHomepage()"
});
formatter.result({
  "duration": 13323389297,
  "status": "passed"
});
formatter.match({
  "location": "homepagestepdefs.iCheckForTheLatestNewsSection()"
});
formatter.result({
  "duration": 29005,
  "status": "passed"
});
formatter.match({
  "location": "homepagestepdefs.latestNewsSectionIsDisplayed()"
});
formatter.result({
  "duration": 86578004,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Check that title is correct",
  "description": "",
  "id": "check-that-the-latest-news-header-is-displayed-on-the-homepage;check-that-title-is-correct",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I click on the hamburger menu",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I select Cases menu option",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "The cases title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "casesstepdefs.iClickOnTheHamburgerMenu()"
});
formatter.result({
  "duration": 4550146631,
  "status": "passed"
});
formatter.match({
  "location": "casesstepdefs.iSelectCasesMenuOption()"
});
formatter.result({
  "duration": 36145,
  "status": "passed"
});
formatter.match({
  "location": "casesstepdefs.theCasesTitleIsDisplayed()"
});
formatter.result({
  "duration": 86039853,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Check that title is correct",
  "description": "",
  "id": "check-that-the-latest-news-header-is-displayed-on-the-homepage;check-that-title-is-correct",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I click on the services hamburger menu",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I select services menu option",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "The cases service title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "servicesstepdefs.iClickOnTheServicesHamburgerMenu()"
});
formatter.result({
  "duration": 1950338866,
  "status": "passed"
});
formatter.match({
  "location": "servicesstepdefs.iSelectServicesMenuOption()"
});
formatter.result({
  "duration": 50870,
  "status": "passed"
});
formatter.match({
  "location": "servicesstepdefs.theCasesServiceTitleIsDisplayed()"
});
formatter.result({
  "duration": 66557549,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Check that title is correct",
  "description": "",
  "id": "check-that-the-latest-news-header-is-displayed-on-the-homepage;check-that-title-is-correct",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I click on the jobs hamburger menu",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I select Jobs menu option",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "The Jobs title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "jobsstepdefs.iClickOnTheJobsHamburgerMenu()"
});
formatter.result({
  "duration": 2422123884,
  "status": "passed"
});
formatter.match({
  "location": "jobsstepdefs.iSelectJobsMenuOption()"
});
formatter.result({
  "duration": 35698,
  "status": "passed"
});
formatter.match({
  "location": "jobsstepdefs.theJobsTitleIsDisplayed()"
});
formatter.result({
  "duration": 85353555,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Check that the count of valtech offices is correct",
  "description": "",
  "id": "check-that-the-latest-news-header-is-displayed-on-the-homepage;check-that-the-count-of-valtech-offices-is-correct",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I click on the contact menu",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I count the amount of offices",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "The amount of offices is correct",
  "keyword": "Then "
});
formatter.match({
  "location": "contactstepdefs.iClickOnTheContactMenu()"
});
formatter.result({
  "duration": 171149322,
  "status": "passed"
});
formatter.match({
  "location": "contactstepdefs.iCountTheAmountOfOffices()"
});
formatter.result({
  "duration": 37037,
  "status": "passed"
});
formatter.match({
  "location": "contactstepdefs.theAmountOfOfficesIsCorrect()"
});
formatter.result({
  "duration": 2998516739,
  "status": "passed"
});
});