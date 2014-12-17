SRCS := $(wildcard utils/*.java) $(wildcard *.java) 

default:
	javac $(SRCS)

clean:
	$(RM) *.class utils/*.class
