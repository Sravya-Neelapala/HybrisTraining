/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jul 31, 2024, 10:14:55 AM                   ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Ebook;
import org.training.core.jalo.Skill;
import org.training.core.jalo.Trainee;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Training}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTraining extends GenericItem
{
	/** Qualifier of the <code>Training.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Training.lct</code> attribute **/
	public static final String LCT = "lct";
	/** Qualifier of the <code>Training.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>Training.trainees</code> attribute **/
	public static final String TRAINEES = "trainees";
	/** Qualifier of the <code>Training.ebooks</code> attribute **/
	public static final String EBOOKS = "ebooks";
	/** Relation ordering override parameter constants for Ebook2TrainingRelation from ((trainingcore))*/
	protected static String EBOOK2TRAININGRELATION_SRC_ORDERED = "relation.Ebook2TrainingRelation.source.ordered";
	protected static String EBOOK2TRAININGRELATION_TGT_ORDERED = "relation.Ebook2TrainingRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Ebook2TrainingRelation from ((trainingcore))*/
	protected static String EBOOK2TRAININGRELATION_MARKMODIFIED = "relation.Ebook2TrainingRelation.markmodified";
	/** Qualifier of the <code>Training.skills</code> attribute **/
	public static final String SKILLS = "skills";
	/** Relation ordering override parameter constants for Training2SkillRelation from ((trainingcore))*/
	protected static String TRAINING2SKILLRELATION_SRC_ORDERED = "relation.Training2SkillRelation.source.ordered";
	protected static String TRAINING2SKILLRELATION_TGT_ORDERED = "relation.Training2SkillRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for Training2SkillRelation from ((trainingcore))*/
	protected static String TRAINING2SKILLRELATION_MARKMODIFIED = "relation.Training2SkillRelation.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n TRAINEES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Trainee> TRAINEESHANDLER = new OneToManyHandler<Trainee>(
	TrainingCoreConstants.TC.TRAINEE,
	false,
	"training",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(LCT, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.duration</code> attribute.
	 * @return the duration
	 */
	public Integer getDuration(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.duration</code> attribute.
	 * @return the duration
	 */
	public Integer getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.duration</code> attribute. 
	 * @return the duration
	 */
	public int getDurationAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDuration( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.duration</code> attribute. 
	 * @return the duration
	 */
	public int getDurationAsPrimitive()
	{
		return getDurationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final Integer value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final SessionContext ctx, final int value)
	{
		setDuration( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.duration</code> attribute. 
	 * @param value the duration
	 */
	public void setDuration(final int value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.ebooks</code> attribute.
	 * @return the ebooks
	 */
	public Collection<Ebook> getEbooks(final SessionContext ctx)
	{
		final List<Ebook> items = getLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			"Ebook",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.ebooks</code> attribute.
	 * @return the ebooks
	 */
	public Collection<Ebook> getEbooks()
	{
		return getEbooks( getSession().getSessionContext() );
	}
	
	public long getEbooksCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			"Ebook",
			null
		);
	}
	
	public long getEbooksCount()
	{
		return getEbooksCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.ebooks</code> attribute. 
	 * @param value the ebooks
	 */
	public void setEbooks(final SessionContext ctx, final Collection<Ebook> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EBOOK2TRAININGRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.ebooks</code> attribute. 
	 * @param value the ebooks
	 */
	public void setEbooks(final Collection<Ebook> value)
	{
		setEbooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ebooks. 
	 * @param value the item to add to ebooks
	 */
	public void addToEbooks(final SessionContext ctx, final Ebook value)
	{
		addLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EBOOK2TRAININGRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ebooks. 
	 * @param value the item to add to ebooks
	 */
	public void addToEbooks(final Ebook value)
	{
		addToEbooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ebooks. 
	 * @param value the item to remove from ebooks
	 */
	public void removeFromEbooks(final SessionContext ctx, final Ebook value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TrainingCoreConstants.Relations.EBOOK2TRAININGRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EBOOK2TRAININGRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ebooks. 
	 * @param value the item to remove from ebooks
	 */
	public void removeFromEbooks(final Ebook value)
	{
		removeFromEbooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Ebook");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(EBOOK2TRAININGRELATION_MARKMODIFIED);
		}
		ComposedType relationSecondEnd1 = TypeManager.getInstance().getComposedType("Skill");
		if(relationSecondEnd1.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(TRAINING2SKILLRELATION_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.lct</code> attribute.
	 * @return the lct
	 */
	public Boolean isLct(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, LCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.lct</code> attribute.
	 * @return the lct
	 */
	public Boolean isLct()
	{
		return isLct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.lct</code> attribute. 
	 * @return the lct
	 */
	public boolean isLctAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isLct( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.lct</code> attribute. 
	 * @return the lct
	 */
	public boolean isLctAsPrimitive()
	{
		return isLctAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.lct</code> attribute. 
	 * @param value the lct
	 */
	public void setLct(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, LCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.lct</code> attribute. 
	 * @param value the lct
	 */
	public void setLct(final Boolean value)
	{
		setLct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.lct</code> attribute. 
	 * @param value the lct
	 */
	public void setLct(final SessionContext ctx, final boolean value)
	{
		setLct( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.lct</code> attribute. 
	 * @param value the lct
	 */
	public void setLct(final boolean value)
	{
		setLct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.skills</code> attribute.
	 * @return the skills
	 */
	public Collection<Skill> getSkills(final SessionContext ctx)
	{
		final List<Skill> items = getLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			"Skill",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.skills</code> attribute.
	 * @return the skills
	 */
	public Collection<Skill> getSkills()
	{
		return getSkills( getSession().getSessionContext() );
	}
	
	public long getSkillsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			"Skill",
			null
		);
	}
	
	public long getSkillsCount()
	{
		return getSkillsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.skills</code> attribute. 
	 * @param value the skills
	 */
	public void setSkills(final SessionContext ctx, final Collection<Skill> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAINING2SKILLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.skills</code> attribute. 
	 * @param value the skills
	 */
	public void setSkills(final Collection<Skill> value)
	{
		setSkills( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to skills. 
	 * @param value the item to add to skills
	 */
	public void addToSkills(final SessionContext ctx, final Skill value)
	{
		addLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAINING2SKILLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to skills. 
	 * @param value the item to add to skills
	 */
	public void addToSkills(final Skill value)
	{
		addToSkills( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from skills. 
	 * @param value the item to remove from skills
	 */
	public void removeFromSkills(final SessionContext ctx, final Skill value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TrainingCoreConstants.Relations.TRAINING2SKILLRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAINING2SKILLRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from skills. 
	 * @param value the item to remove from skills
	 */
	public void removeFromSkills(final Skill value)
	{
		removeFromSkills( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.trainees</code> attribute.
	 * @return the trainees
	 */
	public Collection<Trainee> getTrainees(final SessionContext ctx)
	{
		return TRAINEESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Training.trainees</code> attribute.
	 * @return the trainees
	 */
	public Collection<Trainee> getTrainees()
	{
		return getTrainees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.trainees</code> attribute. 
	 * @param value the trainees
	 */
	public void setTrainees(final SessionContext ctx, final Collection<Trainee> value)
	{
		TRAINEESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Training.trainees</code> attribute. 
	 * @param value the trainees
	 */
	public void setTrainees(final Collection<Trainee> value)
	{
		setTrainees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to trainees. 
	 * @param value the item to add to trainees
	 */
	public void addToTrainees(final SessionContext ctx, final Trainee value)
	{
		TRAINEESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to trainees. 
	 * @param value the item to add to trainees
	 */
	public void addToTrainees(final Trainee value)
	{
		addToTrainees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from trainees. 
	 * @param value the item to remove from trainees
	 */
	public void removeFromTrainees(final SessionContext ctx, final Trainee value)
	{
		TRAINEESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from trainees. 
	 * @param value the item to remove from trainees
	 */
	public void removeFromTrainees(final Trainee value)
	{
		removeFromTrainees( getSession().getSessionContext(), value );
	}
	
}
