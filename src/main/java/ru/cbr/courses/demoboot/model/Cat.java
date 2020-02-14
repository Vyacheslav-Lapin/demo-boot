package ru.cbr.courses.demoboot.model;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Cat {

	@Id
	@EqualsAndHashCode.Exclude
	@GeneratedValue
	@Column(updatable = false, nullable = false)
  UUID id;

	@Version
	int version;

	@NonNull
	String name;

}
