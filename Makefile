SRCS := $(wildcard *.java) $(wildcard misc/*.java)

default:
	javac $(SRCS)

clean:
	$(RM) *.class misc/*.class
