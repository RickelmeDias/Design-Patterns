# Chain of Responsibility

###### Design pattern strategy: https://refactoring.guru/design-patterns/chain-of-responsibility

![Design pattern image from https://refactoring.guru/design-patterns/chain-of-responsibility](https://refactoring.guru/images/patterns/content/chain-of-responsibility/chain-of-responsibility.png?id=56c10d0dc712546cc283cfb3fb463458)

In summary, the key to implementing the Chain of Responsibility pattern is defining a common interface, linking the objects in a chain, determining the order of the objects, and ensuring that each object handles requests appropriately. In this [code sample](./ChainOfResponsibilityWithJava/) was used an abstract class as a common interface.

Chain of Responsibility benefits and liabilities:

- Reduced coupling;
- Flexibility assigning responsibilities to objects;
- Receipt isn't guaranteed

The Chain of Responsibility is a useful approach for building flexible, modular, and reusable systems that can handle requests in a variety of ways.
