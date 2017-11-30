package com.example.demo.injection;

//@Service
public class UseFunctionService {

//    @Autowired
    FunctionService functionService;

    public FunctionService getFunctionService() {
        return functionService;
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
         return functionService.sayHallo(word);
    }
}
