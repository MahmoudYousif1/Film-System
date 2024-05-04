all:
	mkdir -p bin
	javac -d bin src/*.java

clean:
	rm -f bin/*.class