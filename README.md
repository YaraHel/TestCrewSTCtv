# TestCrewSTCtv
# Getting Started
TODO: Guide users through getting your code up and running on their own system. In this section you can talk about:
1.	Installation process
2.	Software dependencies


#Installation process:
  Java 17 - intelij 
#Software dependencies
  cucumber 7 
  junit 5
  selenium 4
  surefire plugin
  maven

#Structure:
Core
  1.WebFactory -> to create chrome driver
  2.Hooks -> to get driver from webFactory and include @BeforeAll
  3.EventHandler -> for a workaround for @AfterAll
  4.PageObjectBase -> to add any common funtions like Wait ...
Pages -> to add logic/PO of methods 
Features/StepDef -> to use cucumber benefis 


