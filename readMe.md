# HOW TO RUN SpriteCloud (QA Automation Assignment)

# Project Settings
    - I used Selenium to automate browser for this task
    - Language - Java 11
    - Build Management Tool - Maven
    - Framework - BDD Cucumber Java
    - Model - Page Object Pattern
    - API - Rest Assured Library

1. Install Java version 11
    - Open cmd / powershell
    - $ brew cask install adoptopenjdk11
    - NOT: If you can't install it from brew, download and install java11

2. Java Home
    1. Java Home for mac >>> https://www.youtube.com/watch?v=zu5Zd9_o_hY&ab_channel=CoolITHelp
        - To check the version >>> echo $SHELL
        - If your path shows ‘/bash’ type these command >>>
          echo "export JAVA_HOME=$(/usr/libexec/java_home -v1.8.0)"
        - If your path shows ’/zsh’ type these command >>>
          echo "export JAVA_HOME=$(/usr/libexec/java_home -v1.8.0)"  ~/.zshrc source ~/.zshrc
    2. Java Home for windows >>>  https://www.youtube.com/watch?v=EtR0tgNH3sY

3. Install Maven
    - brew install maven
    - NOT: If you can't install it from brew, please go to this website >> https://maven.apache.org/install.html

4. HOW TO RUN UI TEST CASES
    1. Run with Maven
        - mvn clean  >>  Delete Target folder
        - mvn verify >>  Test cases of the tag you specified in CukesRunner will work.
        - mvn clean test -Cucumber.filter.tags="@test" >> Running all @test tag test cases
    2. Api Test Run with Maven
        - cd SpriteCloud
        - Look this website >>> https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html

    3. Run with CukesRunner class
        - Go to CukesRunner class
        - If you want all scenarios to work use @test annotation
        - Click Run button

    ![](C:\Users\mami\Desktop\HTML report\CukesRunner.png)

        - If you want a specific scenario to work, use that task's annotation
        - Click Run button

5. HOW TO RUN API TEST CASES
    - Go to api folder->apitest->PetTest
    - Click Run Test Icon as shown
    ![](C:\Users\mami\Desktop\HTML report\APIrunAll.png)
    - To run specific test click as shown
    ![](C:\Users\mami\Desktop\HTML report\APIrunSpecific.png)
      
6. How To Get Report
    1. Cucumber Report : Click the Run button in CukesRunner and after the test is over:
       ![](C:\Users\mami\Desktop\HTML report\Features.png)
       <br>  <br />
    2. Cucumber HTML Report
       <br>  <br />
       ![](C:\Users\mami\Desktop\HTML report\Report.png)
7. How to fix a failing test when UI/API has changed
    1. All locaters are in the page folder.Also UI codes are in the step_definitions folder.
       If you get any error, please check error message where in the result area.
     

8.What you used to select the scenarios, what was your approach?
    AJAX Data->I wanted to show the usage of explicitly wait
    ScrollBars-> With this scenario I used JavascriptExecutor to scroll up-down and side till to find element
    Mouse Over-> I used Action class to show advanced mouse operations
9.Why are they the most important
    The scenarios that I chose are different common used class and methods
10.Manage to upload the test results to Calliope.pro and share a link to the results
    https://app.calliope.pro/reports/146106
    ![](C:\Users\mami\Desktop\HTML report\CalliopeResult.png)