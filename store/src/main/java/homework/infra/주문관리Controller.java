package homework.infra;
import homework.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/주문관리")
@Transactional
public class 주문관리Controller {
    @Autowired
    주문관리Repository 주문관리Repository;





}
