# Java-Class-methods-finder
A simple java program which is used to highlight all the methods and constructors a class offers and also to search for a method by its name


Usage : compile the program as
              javac ShowMethods.java

        Now to run the program use
              java ShowMethods qualified.class.name   ///qualified -java    class-lang    name-string (this is just an example)
              java ShowMethods qualified.class.name   word  ///methods with this word in their name as substring will be displayed


Notes about the methods used:
        ClassObject.getConstructor() - returns an array of Constructor object (constructor of a class as specified by class object) <br />
        ClassObject.getMethods() -returns an array of method object (methods present in a class as specified by class object) <br />
        Pattern.compile(regularExpressionString) - a static method of Pattern class which takes in a regular expression string and returns a Pattern object  <br />
        PatternObject.matcher(String) - returns the reference to all the parts of the string that match the pattern as specified by the compiled pattern <br />
        PatternObject.matcher(String).replaceAll("") - replaces the matched pattern with ""(makes them empty)
                                                      [[ same as StringObj.replaceAll("Pattern","") ]] <br />
