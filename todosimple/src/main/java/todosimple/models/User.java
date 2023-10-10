package todosimple.models;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name = User.TABLE_NAME)
public class User {
    public static final String TABLE_NAME = "user";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
