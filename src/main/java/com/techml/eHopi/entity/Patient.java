/**
 * <h2>DAO LAYER</h2>
 * This class represents a JPA entity for Patient
 *
 * @author TechSingou
 * @version 1.0
 * @since 12.2023
 */

package com.techml.eHopi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 4, max = 20)
    private String name;

    @NotNull
    @Temporal(TemporalType.DATE)

    private Date birthday;

    private boolean sick;

    @Min(100)
    private int score;
}
