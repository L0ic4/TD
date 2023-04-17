package com.example.td;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public abstract class AbstractClass1 {
    protected ConcreteDependance1 concreteDependance1;
    protected ConcreteDependance2 concreteDependance2;
}

/*
* We have used the protected visibility level
* to allow concrete classes to access ConcreteDependency1 and ConcreteDependency2 dependencies
* via the inheritance of the abstract class.
* In this way, we can inject these dependencies into the abstract class
* when it is created and use them in the concrete classes without having to inject them again.
* */
