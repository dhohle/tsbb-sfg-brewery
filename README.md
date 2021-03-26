[![CircleCI](https://circleci.com/gh/dhohle/tsbb-sfg-brewery.svg?style=svg)](https://circleci.com/gh/dhohle/tsbb-sfg-brewery)

README :-) 


# Json-Path: 
https://github.com/json-path/JsonPath

#Wiremock Recorder
## First start Wiremock: 
`java -jar wiremock\wiremock-standalone-2.27.2.jar`
## Goto 
- `http://localhost:8080/__admin/recorder/`
### Recording
The Spring application must be up. So that Wiremock can query against the real service
- The default port - see `application.propertes` - was set to 8081. 
  - As `target URL` set `http://localhost:8081`
  - Start recording
  - Use (fi) Postman to call: `http://localhost:8080/actuator/health` (which Wiremock redirect to 8081)
  - On `stop` (recording), you see how many `Captured stub mappings` were found.
  - These are saved in /mappings dir (request and response)
### Replay
When recording is off, and the Spring application is down, WireMock will use the results gathered during recording to send back