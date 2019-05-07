package com.codeyelmae.helloworld

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RestController
class MainController {

    @RequestMapping(value = ["/hello", "/", "/index"], method = [RequestMethod.GET])
    @ResponseBody
    fun hello_world(): String {
        return "hello, world"
    }

    @RequestMapping(value = ["/hello/{name}"], method = [RequestMethod.GET])
    fun hello_name(@PathVariable name: String, model: Model): String {
        model.addAttribute("name", name)
        return "hello_name"
    }
}