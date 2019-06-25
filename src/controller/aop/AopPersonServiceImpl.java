package controller.aop;

public class AopPersonServiceImpl implements PersonService {

    @Override
    public String savePerson() {
        System.out.println("添加");
        return "保存成功";
    }

    @Override
    public void updatePerson() {
        System.out.println("修改成功");
    }

    @Override
    public void deletePerson() {
        System.out.println("删除成功");
    }
}
