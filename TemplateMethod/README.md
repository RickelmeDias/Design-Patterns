# Template Method

###### Design pattern strategy: https://refactoring.guru/design-patterns/template-method

![Design pattern image from https://refactoring.guru/design-patterns/template-method](https://refactoring.guru/images/patterns/content/template-method/template-method.png?id=eee9461742f832814f19612ccf472819)

Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

The key to implementing the Template Method pattern is to define a common abstract base class that provides a template for the algorithm, with some steps deferred to be implemented by subclasses. This allows for a flexible and extensible design that can accommodate different variations of the algorithm while maintaining a common structure. In this [code sample](./TemplateMethodWithJava/) is used a abstract class.
