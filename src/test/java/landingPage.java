public class landingPage extends basePage {

    public void checkStatus(){
       String pageName = web.getDriver().getTitle();
        System.out.println("Name of the page is:\n"+pageName);
    }
}
