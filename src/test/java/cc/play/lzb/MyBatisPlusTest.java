package cc.play.lzb;

import cc.play.lzb.dao.TraceBaseNodeMapper;
import cc.play.lzb.entity.TraceBaseNode;
import cc.play.lzb.service.impl.TraceBaseNodeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisPlusTest {
    @Autowired
    private TraceBaseNodeMapper traceBaseNodeMapper;

    @Autowired
    private TraceBaseNodeServiceImpl traceBaseNodeService;

    @Test
    public void testSelectOne() {
        TraceBaseNode node = traceBaseNodeMapper.selectById("39");
        System.out.println(node);
        System.out.println(traceBaseNodeMapper.selectCount(null));
    }

    @Test
    public void testSelectALL(){
        List<TraceBaseNode> userList = traceBaseNodeMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectByService(){
        Integer ere = traceBaseNodeService.count();
        System.out.println(ere);
    }

}
