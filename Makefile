SRCS := $(wildcard *.java)

default: sentinel

clean:
	$(RM) *.class

sentinel: $(SRCS)
	javac $(SRCS)
