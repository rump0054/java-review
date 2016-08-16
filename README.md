# java-review
A Java code repository of review materials for technical interviews and refreshing basic knowledge

After my frist technical interview in almost a decade, I realized very fast that all of my basic
knowledge of web and Java development was VERY rusty.  The answers I gave were all true at the time
but I was not satisfied with any them.  Within an hour of the interview (an hour too late to give better
answers) and using just my memory, I was able to answer the exact same questions exponentialy better and 
realized some were answers were incorrect. It was abundabtly clear that I needed to "flex" my basic 
programming muscles.

This reposity will host questions I was either asked or have come up with on my own as well as my initial
answer and updated answers.  THe wiki pages will have notes on the over arching subject matters of the
questions asked.  I will also post code and any web apps I write during this process, time permitting.


## Questions
### Are you familar with the Servlet API?
My initial answer was basically no because I used IoC/DI frameworks and never had to write raw servlet
code.  This is of course WRONG!  As a professional Java web developer for almost a decade, of course I
am familiar with the Servlet API.  The frameworks I used didn't require me to directly use objects
like HttpServletRequest or HttpServletRespose in servlet code but I still made use of most of the API.
All application configuration code uses the Servlet API.  I also wrote classes based on Listeners,
Filters, Async controllers, and Cookies.  I've also made extenisve use of the ServletContext object.

### How do you deploy Java web applications?
Initially I answered no because I didn't use deployment methods but you can use JAR files.  Part of 
this is correct but incomplete, and part is wrong-ish.  To deploy web apps, you do use JAR files but
they are called WAR files.  I didn't use WAR because of the setup of the develpment machines vs.
production machines.  DEV ran Java 6 with Tomcat 7 and PROD ran Java 5 with Tomcat 6.  To deploy any
application, you would have to copy the entire source code from DEV to PROD machine into a working
directory, then recompile the entire application, then move the appropriate config files for the
application to the appropriate places on the machine.  I could have created a WAR file from the 
compiled source code and then place the file in Tomcat's webapp folder to have it auto-loaded but
instead I would just skip the WAR file stage since it seemed redundant.

### Familiar with Hibernate?
I'm not directly familiar with using Hibernate in code, however I have used JPA/Hibernate based 
frameworks like Grails.  These frameworks use their own sytax and classes to manipulate persisted
data but they are all built on and call Hibernate libraries under the hood.

### Familiar with design patterns (i.e Factories)
This question threw me entirely.  I have seen classes that are labeled as Factories that are used by
servlet code to instantiate lists of options for drop down UI elements.  I had to google this one -
it is about hiding the creating logic of an object and then referring to the object using a common interface.
I've used this while learning Spring but can't remember a specific example in any other code.  It is a
basic OO programming concept though so it seems almost impossible that I've never used it.

### Diagram a database connected web application
