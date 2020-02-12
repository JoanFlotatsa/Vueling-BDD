$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/searchFlight.feature");
formatter.feature({
  "name": "Search a flight from BCN to AGP",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful search",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Miguel wants to book a flight",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchFlightStepDefinitions.user_wants_to_book_a_flight(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "He looks for a flight from BCN to AGP",
  "keyword": "When "
});
formatter.match({
  "location": "SearchFlightStepDefinitions.he_looks_for_a_flight(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Her travel plan destination should be: Málaga",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchFlightStepDefinitions.he_should_see_her_itinerary(String)"
});
formatter.result({
  "status": "passed"
});
});