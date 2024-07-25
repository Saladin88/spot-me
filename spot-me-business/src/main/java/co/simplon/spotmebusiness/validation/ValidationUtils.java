package co.simplon.spotmebusiness.validation;

import java.util.Map;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.HandlerMapping;

import jakarta.servlet.http.HttpServletRequest;

public class ValidationUtils {

    ValidationUtils() {

    }

    @SuppressWarnings("unchecked")
    static String pathVariableString(String name) {
	HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
		.getRequest();
	Map<String, String> pathVariables = (Map<String, String>) request
		.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE);
	return pathVariables.get(name);
    }

    static Long LongpathVariableAsLong(String name) {
	return Long.valueOf(pathVariableString(name));
    }

}
