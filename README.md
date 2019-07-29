# 设计模式（DesignPatternsDemo）
23种设计模式的DEMO分享（持续更新）

### 开发及编辑工具：
Visual Studio Code (官网：https://code.visualstudio.com/)



<br>

## 什么是设计模式？

通俗来讲，设计模式就是针对某一种特殊场景而给出的标准解决方案，它是前辈们的经验性总结，也是实现软件工程化的基础，良好的设计模式应用 可以是我们的软件变得更加健壮可维护。但是如果场景并不是符合规范，需要同学们依赖设计模式6大原则给出合理的解决办法。

**可以将23种设计模式按照类型划分为三大类，如下：**

创建型设计模式：如同它的名字那样，它是用来解耦对象的实例化过程。    
结构型设计模式：将类和对象按照一定规则组合成一个更加强大的结构体。  
行为型设计模式：定义类和对象的交互行为。    

**设计模式6大原则：**
1. 单一职责
2. 开闭原则（对扩展开放，对修改封闭。例如：抽象基类的使用）
3. 接口隔离（接口尽可能细、隔离）
4. 依赖倒置或依赖反转（模块间的依赖通过抽象来发生，实现类之间不发生直接的依赖关系，而依赖关系通过接口或抽象产生）
5. 里氏替换原则（依赖抽象与接口）
6. 迪米特原则（解耦）

<br>
<br>

***本文分享方式主要由目录入口进入各个模块，针对于各个模块进行详细的讲解。各模块主要针对以下几个模块进行解读：***
- 定义与特点
- 应用场景
- 结构(UML类图)与说明
- (模式中如果有多种实现模式,各种实现优缺点)
- 可能会遇到的坑

<br>

# 23种设计模式目录
- 创建型设计模式
    - [单例模式 - Singleton Pattern](./SingletonPattern/)&nbsp;&nbsp;(某个类只有一个实例，提供一个全局访问点)
    - [建造者模式 - Builder Pattern](./BuilderPattern/)&nbsp;&nbsp;(封装一个复杂对象的构建过程,按照步骤构造对象)
    - 原型模式 - Prototype Pattern&nbsp;&nbsp;(通过复制现有的实例来构建新的实例)
    - 简单工厂模式 - Simple Factory Pattern&nbsp;&nbsp;(一个工厂类根据传入的参数决定创建哪一种产品类的实例)
    - 工厂模式- Factory Method Pattern&nbsp;&nbsp; (定义一个创建对象的接口，让子类决定实例化哪个类)
    - 抽象工厂模式 - Abstract Factory Pattern&nbsp;&nbsp;(创建相关依赖对象的家族，而无需指定具体类。)  

- 结构型设计模式
    - 适配器模式 - Adapter Pattern&nbsp;&nbsp;(将一个类的方法或者接口转换成客户希望的另一个接口)
    - 组合模式 - Composite Pattern&nbsp;&nbsp;(将对象组合成树形结构以表示整体和部分的层次结构)
    - 装饰模式 - Decorator Pattern &nbsp;&nbsp;(动态的给对象添加新的功能) 
    - 门面模式/外观模式 - Facade Pattern&nbsp;&nbsp;(对外提供一个统-的方法，用来访问子系统中的一群接口)
    - 桥梁模式/桥接模式 - Bridge Pattern&nbsp;&nbsp;(将抽象部分和它的实现部分相互分离，是它们都可以独立变化)
    - 享元模式 - Flyweight Pattern&nbsp;&nbsp;(通过共享技术来有效的支持大量细粒度的对象)
    - 代理模式 - Proxy pattern&nbsp;&nbsp;(为其他对象提供一个代理以
控制这个对象的访问)    

- 行为型设计模式
    - 模板模式 - Template Method Pattern&nbsp;&nbsp;(定义一个算法结构，而将-些步骤延迟到子类实现)
    - 解释器模式 - Interpreter Pattern&nbsp;&nbsp;(给定一个语音，定义它的文法的一种表示，并定义一个解释器)
    - 策略模式 - Strategy Pattern&nbsp;&nbsp;(定义一系列算法，把他们封装起来，并且使他们可以互相替换)
    - 状态模式 - State Pattern&nbsp;&nbsp;(允许一个对象在其内部对象状态改变时改变它的行为)
    - 观察者模式 - Observer Pattern&nbsp;&nbsp;(对象间一对多 的依赖关系)
    - 备忘录模式- Memento Pattern&nbsp;&nbsp;(在不破坏封装的前提下，保持对象的内部状态)
    - 中介者模式 - Mediator Pattern&nbsp;&nbsp;(用一个中介对象来封装一系列对象的交互)
    - 命令模式 - Command Pattern&nbsp;&nbsp;(将命令请求封装称为一个对象，可以将不同的请求来进行参数化)
    - 访问者模式 - Visitor Pattern&nbsp;&nbsp;(在不改变数据结构的前提下，增加作用于-组对象元素的新功能 
    - 责任链模式 - Chain of Responsibility Pattern&nbsp;&nbsp;(将请求的发送者和接受者解耦， 使得多个对象都有处理这个请求的机会)
    - 迭代器模式 - Iterator Pattern&nbsp;&nbsp;(一种遍历访问聚合对象各个元素的方法，不暴露给对象的内部结构)

<br>

