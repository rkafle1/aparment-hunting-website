import java.util.List;
import java.util.ArrayList; 
public class post {
    String Content;
    String Discription;
    int likes;
    int dislikes;
    List<String> comments;
    // initializes post
    public post(String Content, String Discription){
        this.Content = Content;
        this.Discription = Discription;
        this.likes = 0;
        this.dislikes = 0;
        this.comments = new ArrayList<>();
    }
    // helper methods
    public int addlike(){
        likes += 1;
        return likes;
    }
    public int adddislike(){
        dislikes += 1;
        return dislikes;
    }
    public List<String> addcomment(String comment){
        comments.add(comment);
        return comments;
    }

    public static void main(String[] args){
        post p1 = new post("this is a house", "this is a description");
        p1.addlike();
        p1.adddislike();
        p1.addlike();
        p1.addcomment("this sucks, find a new one. ");
        p1.addcomment("this is fine");
        System.out.println(p1.Content+p1.Discription+p1.likes + p1.dislikes+ p1.comments);
    }

}
