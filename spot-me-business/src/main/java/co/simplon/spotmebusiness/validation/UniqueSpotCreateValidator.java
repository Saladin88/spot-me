package co.simplon.spotmebusiness.validation;

import co.simplon.spotmebusiness.dtos.SpotCreate;
import co.simplon.spotmebusiness.repositories.SpotRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueSpotCreateValidator implements ConstraintValidator<UniqueSpotCreate, SpotCreate> {

    private final SpotRepository spots;

    public UniqueSpotCreateValidator(SpotRepository spots) {
	this.spots = spots;
    };

    @Override
    public boolean isValid(SpotCreate inputs, ConstraintValidatorContext context) {
	String name = inputs.name();
	Double lat = inputs.lat();
	Double lng = inputs.lng();
	if (name == null || lat == null || lng == null) {
	    return true;
	}
	// Other issue to handle error message
	// context.disableDefaultConstraintViolation();
	// context.buildConstraintViolationWithTemplate(
	// "This combiation with name, lat and long already exist, please try another
	// one")
	// .addConstraintViolation();

	return !spots.existsByNameIgnoreCaseAndLatAndLng(name, lat, lng);
    }

}
