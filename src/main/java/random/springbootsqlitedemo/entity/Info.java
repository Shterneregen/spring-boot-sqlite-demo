package random.springbootsqlitedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "info")
public class Info {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column(name = "time")
    public String time;
    @Column(name = "ip")
    public String ip;
    @Column(name = "text")
    public String text;

    public Info(String time, String ip, String text) {
        this.time = time;
        this.ip = ip;
        this.text = text;
    }

}
