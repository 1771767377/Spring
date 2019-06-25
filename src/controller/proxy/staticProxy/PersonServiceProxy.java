package controller.proxy.staticProxy;

public class PersonServiceProxy implements PersonService {

    //目标类
    private PersonService personService;
    //增强类
    private Transaction transaction;


    public PersonServiceProxy(PersonService personService,Transaction transaction){
        this.personService = personService;
        this.transaction = transaction;
    }

    @Override
    public void savePerson() {
        transaction.beginTransaction();
        personService.savePerson();
        transaction.commitTransaction();
    }

    @Override
    public void updatePerson() {
        transaction.beginTransaction();
        personService.updatePerson();
        transaction.commitTransaction();
    }

    @Override
    public void deletePerson() {
        transaction.beginTransaction();
        personService.deletePerson();
        transaction.commitTransaction();
    }
}
