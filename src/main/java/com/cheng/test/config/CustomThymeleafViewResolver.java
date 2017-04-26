package com.cheng.test.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

public class CustomThymeleafViewResolver extends ThymeleafViewResolver {

	@Autowired
	private CommonPropertyConfiguration config;
	
	/*@Override
	protected View loadView(String rawViewName, Locale locale) throws Exception {
		String viewName = rawViewName.startsWith(config.getLayout()) ? rawViewName : config.getFullLayout();
		AbstractThymeleafView view = (AbstractThymeleafView) super.loadView(viewName, locale);
		if(!rawViewName.startsWith(config.getLayout())){
			view.addStaticVariable("user", UserUtil.getUser());
			view.addStaticVariable("templateName", rawViewName);
		}
		return view;
	}*/

}
