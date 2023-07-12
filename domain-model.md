#TDD OOP Abstraction Exercise
Domain Model

| Class | Variable             | Method                                  | Scenario                                                 | Output             |
|-------|----------------------|-----------------------------------------|----------------------------------------------------------|--------------------|
| User  | String `emailAdress` |                                         |                                                          |                    |
|       | String `password`    |                                         |                                                          |                    |
|       | boolean `disabled`   |                                         |                                                          |                    |
|       |                      | validatePassword(String `password`)     | Checks if new `password` is longer or equal than 8 signs | error message      |
|       |                      | validateEmailAdress(String emailAdress) | Checks if `emailAdress` contains `@`                     | error message      |
|       |                      | checkIfAccountIsDisabled()              | Returns state of variable `disabled`                     | boolean `disabled` |