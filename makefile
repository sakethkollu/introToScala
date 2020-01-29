#========== PREREQ MAKE COMMANDS ==========

getImage:
	docker pull sakethkollu/intro_to_scala:latest

getImageAlpine:
	docker pull sakethkollu/alpine_scala:latest

startContainer:
	docker run --rm -it --privileged -v ${PWD}:/introToScala sakethkollu/intro_to_scala

startContainerAlpine:
	docker run --rm -it --privileged -v ${PWD}:/introToScala sakethkollu/alpine_scala
#========== TODO MAKE COMMANDS ==========

#Compile and create class files for lab0: HelloWorld
compileLab0: ./todo/lab0/HelloWorld.scala
	scalac -classpath ./todo/lab0/classes -d ./todo/lab0/classes ./todo/lab0/HelloWorld.scala

runLab0:
	scala -cp ./todo/lab0/classes HelloWorld

lab0:
	make compileLab0
	make runLab0

#Compile and create class files for lab1_1: Car
compileLab1_1: ./todo/lab1/Lab1Autograder.scala ./todo/lab1/Car.scala  
	scalac -classpath ./todo/lab1/classes -d ./todo/lab1/classes ./todo/lab1/Car.scala ./todo/lab1/Lab1Autograder.scala

runLab1_1:
	scala -cp ./todo/lab1/classes/ Lab1Autograder "lab1_1"

lab1_1:
	make compileLab1_1
	make runLab1_1

#Compile and create class files for lab2: Lab2.scala
compileLab2: ./todo/lab2/Lab2.scala ./todo/lab2/Lab2Autograder.scala
	scalac -classpath ./todo/lab2/classes -d ./todo/lab2/classes ./todo/lab2/Lab2.scala ./todo/lab2/Lab2Autograder.scala

runPrime500:
	scala -cp ./todo/lab2/classes/ Lab2Autograder "nthPrime"

runMissing:
	scala -cp ./todo/lab2/classes/ Lab2Autograder "missing"

runLab2:
	scala -cp ./todo/lab2/classes/ Lab2Autograder "lab2"

lab2:
	make compileLab2
	make runLab2

compileWordCount: ./todo/lab2/WordCount.scala ./todo/lab2/WordCountAutograder.scala
	scalac -classpath ./todo/lab2/classes -d ./todo/lab2/classes ./todo/lab2/WordCount.scala ./todo/lab2/WordCountAutograder.scala

runWordCount:
	scala -cp ./todo/lab2/classes/ WordCountAutograder

wordCount:
	make compileWordCount
	make runWordCount

#Compile and create class files for lab3: Lab3.scala

compileLab3: ./todo/lab3/Lab3.scala ./todo/lab3/Lab3Autograder.scala
	scalac -classpath ./todo/lab3/classes -d ./todo/lab3/classes ./todo/lab3/Lab3.scala ./todo/lab3/Lab3Autograder.scala

runGCD:
	scala -cp ./todo/lab3/classes/ Lab3Autograder "gcd"

runCountingChange:
	scala -cp ./todo/lab3/classes/ Lab3Autograder "countingchange"

runMergeLL:
	scala -cp ./todo/lab3/classes/ Lab3Autograder "mergeLL"

runLab3:
	scala -cp ./solutions/lab3/classes/ Lab3Autograder "lab3"

lab3:
	make compileLab3
	make runLab3

#Clean all class files
clean:
	find  ./todo -name "*.class" -type f -delete

#========== SOLUTIONS MAKE COMMANDS ==========
 
#SOLUTION: Compile and create class files for lab0: HelloWorld
sol_compileLab0: ./solutions/lab0/HelloWorld.scala
	scalac -classpath ./solutions/lab0/classes -d ./solutions/lab0/classes ./solutions/lab0/HelloWorld.scala

sol_runLab0:
	scala -cp ./solutions/lab0/classes HelloWorld

sol_lab0:
	make sol_compileLab0
	make sol_runLab0

#SOLUTION: Compile and create class files for lab1_1: Car
sol_compileLab1_1: ./solutions/lab1/Lab1Autograder.scala ./solutions/lab1/Car.scala  
	scalac -classpath ./solutions/lab1/classes -d ./solutions/lab1/classes ./solutions/lab1/Car.scala ./solutions/lab1/Lab1Autograder.scala

sol_runLab1_1:
	scala -cp ./solutions/lab1/classes/ Lab1Autograder "lab1_1"

sol_lab1_1:
	make sol_compileLab1_1
	make sol_runLab1_1

#SOLUTION: Compile and create class files for lab2: Lab2.scala
sol_compileLab2: ./solutions/lab2/Lab2.scala ./solutions/lab2/Lab2Autograder.scala
	scalac -classpath ./solutions/lab2/classes -d ./solutions/lab2/classes ./solutions/lab2/Lab2.scala ./solutions/lab2/Lab2Autograder.scala

sol_runPrime500:
	scala -cp ./solutions/lab2/classes/ Lab2Autograder "nthPrime"

sol_runMissing:
	scala -cp ./solutions/lab2/classes/ Lab2Autograder "missing"

sol_runLab2:
	scala -cp ./solutions/lab2/classes/ Lab2Autograder "lab2"

sol_lab2:
	make sol_compileLab2
	make sol_runLab2

sol_compileWordCount: ./solutions/lab2/WordCount.scala ./solutions/lab2/WordCountAutograder.scala
	scalac -classpath ./solutions/lab2/classes -d ./solutions/lab2/classes ./solutions/lab2/WordCount.scala ./solutions/lab2/WordCountAutograder.scala

sol_runWordCount:
	scala -cp ./solutions/lab2/classes/ WordCountAutograder

sol_wordCount:
	make sol_compileWordCount
	make sol_runWordCount

#SOLUTION: Compile and create class files for lab3: Lab3.scala

sol_compileLab3: ./solutions/lab3/Lab3.scala ./solutions/lab3/Lab3Autograder.scala
	scalac -classpath ./solutions/lab3/classes -d ./solutions/lab3/classes ./solutions/lab3/Lab3.scala ./solutions/lab3/Lab3Autograder.scala

sol_runGCD:
	scala -cp ./solutions/lab3/classes/ Lab3Autograder "gcd"

sol_runCountingChange:
	scala -cp ./solutions/lab3/classes/ Lab3Autograder "countingchange"

sol_runMergeLL:
	scala -cp ./solutions/lab3/classes/ Lab3Autograder "mergeLL"

sol_runLab3:
	scala -cp ./solutions/lab3/classes/ Lab3Autograder "lab3"

sol_lab3:
	make sol_compileLab3
	make sol_runLab3

#SOLUTION: Clean all class files
sol_clean:
	find  ./solutions -name "*.class" -type f -delete