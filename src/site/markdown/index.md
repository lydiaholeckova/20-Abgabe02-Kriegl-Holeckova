# Aufgabe 02 - Kriegl- Holeckova

Short description

This project includes the interface IQueue and the class StringQueue which implements the interface IQueue. The StringQueue class is an implementation a Queue for Strings. Furthermore the project includes the Testclass for StringQueue, which will have a 100% test-coverage.


- **What is a queue?**  
A queue is an ordered collection of items where the addition of new items happens at one end, and the removal of existing items occurs at the other end. The item that has been in the collection the longest is at the front. This ordering principle is sometimes called FIFO, first-in first-out. It is also known as “first-come first-served.” So the first item that has been added, is also the first one to be removed.

- **How can a queue be tested?**  
Basic queue operations are:  
enqueue: add an element to the back  
dequeue: remove the front element  
peek: examine the front element  
You can test the single methods, for example you can test if the element you put in, is indeed on the last position. Or the element you removed was really the one that was in there the longest (e.g. with timestamps).

- **Possible applications of a queue?**  
Serving requests on a single shared resource, like a printer, CPU task scheduling etc.  
In real life scenario, Call Center phone systems use Queues to hold people calling them in an order, until a service representative is free.  
Handling of interrupts in real-time systems. The interrupts are handled in the same order as they arrive i.e. First come first served.

- **What are generics?**  
Generic programming is a style of computer programming in which algorithms are written in terms of types to-be-specified-later that are then instantiated when needed for specific types provided as parameters. (Generics allow you to customize a "generic" method or class to whatever type you're working with.)

- **What is code coverage for source code testing?**
Code coverage is the percentage of code which is covered by automated tests. Code coverage measurement simply determines which statements in a body of code have been executed through a test run, and which statements have not.


