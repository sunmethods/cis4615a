public synchronized void doSomething(long timeout)
                                     throws InterruptedException {
// ...
  while (<condition does not hold>) {
    wait(timeout); // Immediately releases the current monitor
  }
}